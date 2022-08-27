
public class Product {
private String name;
private int su, price, pur, deliv, margin;
private double mrate; //2쨰자리까지 
public Product(String name, int su, int price, int pur, int deliv, int margin, double mrate) {
	super();
	this.name = name;
	this.su = su;
	this.price = price;
	this.pur = pur;
	this.deliv = deliv;
	this.margin = margin;
	this.mrate = mrate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSu() {
	return su;
}
public void setSu(int su) {
	this.su = su;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getPur() {
	return pur;
}
public void setPur(int pur) {
	this.pur = pur;
}
public int getDeliv() {
	return deliv;
}
public void setDeliv(int deliv) {
	this.deliv = deliv;
}
public int getMargin() {
	return margin;
}
public void setMargin(int margin) {
	this.margin = margin;
}
public double getMrate() {
	return mrate;
}
public void setMrate(double mrate) {
	this.mrate = mrate;
}
@Override
public String toString() {
	return String.format("Product [name=%s, su=%s, price=%s, pur=%s, deliv=%s, margin=%s, mrate=%s]", name, su, price,
			pur, deliv, margin, mrate);
}

}
