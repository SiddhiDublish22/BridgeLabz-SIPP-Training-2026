class ProfitLoss {
  public static void main(String[] args) {
    double costPrice = 129, sellingPrice = 191;
    double profit = sellingPrice - costPrice;
    double profitPercent = (profit / costPrice) * 100;
    System.out.println("Profit=" + profit + " Profit%=" + profitPercent);
  }
}