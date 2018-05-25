package com.sharun.memoryDevices;

public interface USB {
	void read();
}

public interface MemoryCard {
	void read();
}

public class HP implements USB {

	@Override
	public void read() {
		this.file();
	}

	void file() {
		System.out.println("You are now accessing the movies in the USB");
	}
}

public class Sandisk implements MemoryCard {

	@Override
	public void read() {
		this.file();
	}

	void file() {
		System.out
				.println("You are now accessing the songs in the memory card");
	}
}

public class MemoryCardAdapter implements USB {
	MemoryCard MCAdapter;

	public MemoryCardAdapter(MemoryCard pendrive) {
		this.MCAdapter = pendrive;
	}

	@Override
	public void read() {
		MCAdapter.read();
	}
}

package com.sharun.DesignPrinciple;

import com.sharun.memoryDevices.*;

public class AdapterDesignMemoryDevice {
	public static void main(String[] args) {
		USB a = new HP();
		MemoryCard b = new Sandisk();
		a.read();
		b.read();
		USB c = new MemoryCardAdapter(new Sandisk());
		c.read();

	}
}




/* OUTPUT
* You are now accessing the movies in the USB
* You are now accessing the songs in the memory card
* You are now accessing the songs in the memory card
*/
