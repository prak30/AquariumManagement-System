package com.aquariummanagementsystem;

import java.util.Objects;

public abstract class Fish {
	enum Colour {
		WHITE, GOLD, RED, BLACK, SILVER, BLUE
	};

	int length;
	Colour colour;
	int price;
	String name;
	String id;

	public abstract void eat();

//	@Override
	// public String toString() {
	// return "Fish [length=" + length + ", colour=" + colour + ", price=" + price +
	// ", name=" + name + "]";
	// }
	@Override
	public String toString() {
		return "Fish [length=" + length + ", colour=" + colour + ", price=" + price + ", name=" + name + ", id=" + id
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fish other = (Fish) obj;
		return Objects.equals(id, other.id);
	}

}
