//@Table(name = "OrderItems")
//public class OrderItems{
//
//	@Entity
//  	@Id
//  	@GeneratedValue(strategy = GenerationType.AUTO)
//  private UUID id = UUID.randomUUID();
//  private UUID order;
//  private UUID itemId;
//  private double quantity;
//  private double totalValue;
//  
//
//  public OrderItem(UUID order, UUID itemId, double quantity, double totalValue){
//
//    this.order = order;
//    this.itemId = itemId;
//    this.quantity = quantity;
//    this.totalValue = totalValue;
//
//  }
//
//    public UUID getOrder() {
//    return order;
//  }
//  public void setOrder(UUID order) {
//    this.order = order;
//  }
//  public UUID getItemId() {
//    return itemId;
//  }
//  public void setItemId(UUID itemId) {
//    this.itemId = itemId;
//  }
//
//  public double getTotalValue() {
//    return totalValue;
//  }
//  public void setTotalValue(double totalValue) {
//    this.totalValue = totalValue;
//  }
//  
//  public double getQuantity() {
//    return quantity;
//  }
//  public void setQuantity(double quantity) {
//    this.quantity = quantity;
//  }
//  public UUID getId() {
//    return id;
//  }
//}