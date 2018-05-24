package com.sharun.Internet;

public interface Internet {
	void connectTo(String website);
}


public class OpenInternet implements Internet{
	public void connectTo(String website){
	System.out.println("You have reached the site: " + website);
 }
}

import java.util.List;
import java.util.LinkedList;

package com.sharun.Internet;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProxyInternet implements Internet {

	// open access object of open internet
	Internet open_access = new OpenInternet();

	static List<String> banned_website;

	static {
		banned_website = new LinkedList<String>();
		banned_website.add("facebook.com");
		banned_website.add("whatsapp.com");
		banned_website.add("instagram.com");
	}

	public void connectTo(String website) {
		if (banned_website.contains(website)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the password");
			int password = sc.nextInt();
			if (password == 123)
				open_access.connectTo(website);
			else
				System.out.println("You don't have access to " + website);
		} else {
			open_access.connectTo(website);
		}
	}
}

package com.sharun.DesignPrinciple;

import com.sharun.Internet.*;

public class ProxyDesignInternet {
	public static void main(String[] args){
		Internet user = new ProxyInternet();
		user.connectTo("google.com");
		user.connectTo("facebook.com");
	}
}
