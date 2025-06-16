package challenge8;
public class Arrays {
    public static void main(String[] args) {
        String[] orderIds={"B123","C234","A345","C15","B177","A123","C567","A788","G3003","C235","B179"};
        for(String items: orderIds){
            if(items.startsWith("C")){
                System.out.println(items);
            }
        }

}
}
