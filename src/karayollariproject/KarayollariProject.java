package karayollariproject;


public class KarayollariProject extends TurkeyCityDistances{

    
    public static void main(String[] args) {
        
        //System.out.println(Cities[34]);
        //System.out.println(DistanceFromAtoB(34 , 5));
        
        System.out.println("starting the other method");
        
        System.out.println(FromRandomCityto10Cities());
        
        System.out.println("Ankara'nın komşuları: " + cityNeighbors.get("ANKARA"));
        System.out.println("---------------------------------");
        
    //    System.out.println("\n\n--- Tüm Şehirlerin Komşu Listesi Çağrılıyor ---");
        listAllNeighbors();
      
        findFarthestNeighborPair();
        
        
        
        System.out.println("--- Zonguldak'dan İzmir'e giden yol ---");
        findPathToIzmir("Zonguldak");
        
        
        
    }
    
    
}
