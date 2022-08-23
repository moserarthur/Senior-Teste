//@Table(name = "Order")
//public class Order {
//
//	@Entity
//  	@Id
//  	@GeneratedValue(strategy = GenerationType.AUTO)
//  private UUID id = UUID.randomUUID();
//  private int number;
//  private Timestamp date;
//  private double percentualDiscount;
//  private double value;
//  
//  
//
//  public Order(int number, Timestamp date, double percentualDiscount, double value) {
//    this.number = number;
//    this.date = date;
//    this.percentualDiscount = percentualDiscount;
//    this.value = value;  
//  }
//
//  	public Timestamp getDate() {
//    return date;
//  }
//  public void setDate(Timestamp date) {
//    this.date = date;
//  }
//
//	public double getPercentualDiscount() {
//    return percentualDiscount;
//  }
//  public void setValue(double percentualDiscount) {
//    this.percentualDiscount = percentualDiscount;
//  }
//
//    public double getValue() {
//    return value;
//  }
//  public void setValue(double value) {
//    this.value = value;
//  }
//  
//  public int getNumber() {
//    return number;
//  }
//  public void setNumber(int number) {
//    this.number = number;
//  }
//  public UUID getId() {
//    return id;
//  }
//}