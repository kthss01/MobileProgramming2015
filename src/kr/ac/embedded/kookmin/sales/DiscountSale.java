package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
	
	public DiscountSale() {
		/** 구현 하시오 **/ 
		super();
		discount = 0;
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		/** 구현 하시오 **/ 
		super(theName,thePrice);
		discount = theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** 구현 하시오 **/ 
		this.setName(originalObject.getName());
		this.setPrice(originalObject.getPrice());
		discount = originalObject.getPrice();
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	@Override
	public double bill() {
		/** 구현 하시오 **/ 
		return this.getPrice() * (100-discount)/100;
	}
	
	public double getDiscount() {
		/** 구현 하시오 **/ 
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		/** 구현 하시오 **/ 
		discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		/** 구현 하시오 **/ 
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			DiscountSale otherSale = (DiscountSale) otherObject;
			return (this.getName().equals(otherSale.getName()) 
					&& (this.getPrice() == otherSale.getPrice()));
		}
	}
	
	
	public DiscountSale clone() {
		/** 구현 하시오....  임시생성자 사용 **/ 
		return new DiscountSale(this);
	}
}
