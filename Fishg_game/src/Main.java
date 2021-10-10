//2021_05_08~              제작: 정영빈

import java.util.Random;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {

      String fish_sea[] = { "[등급:☆☆☆☆☆] 쓰레기", "[등급:☆☆☆☆☆] 타이어", "[등급:☆☆☆☆☆] 고무장갑", "[등급:☆☆☆☆☆] 장난감",
    		                "[등급:★☆☆☆☆] 멸치", "고등어", "참치","먹장어","갯장어",
    		                "붕장어","밴댕이","전어","정어리","청어","준치","대구","아귀","가자미","넙치","서대",
    		                "꽁치","날치","쥐치","복어","물메기","쏠배감펭","볼락","우럭","삼치","다랑어","까나리",
    		                "꼬치고기","농어","도루묵","참돔","감성돔","돌돔","병어","숭어","옥돔","참치방어","방어",
    		                "황새치","홍어","[등급:★★★★★] 백상아리","[등급:★★★★★] 돌고래","[등급:★★★★★] 청새치",
    		                "[등급:★★★★★] 바다코끼리","[등급:★★★★★] 바다악어","[등급:★★★★★] 향유고래","[등급:★★★★★] 흰수염고래",
    		                "[등급:★★★★★] 범고래"}; // 바다

      String fish_river[] = { "쓰레기", "타이어", "고무장갑", "장난감","붕어","쏘가리","[등급:★★★★☆] 배스","철갑상어","뱀장어",
    		                  "무태장어","웅어","미꾸라지","잉어","향어","황어","피라냐","메기","동자개","연어",
    		                  "산천어","송어","자치","빙어","은어","가물치","블루길"}; // 강(민물)
      
      //help
        String 영빈아="/영빈아 낚시 (낚시 시작)";
        String hit="/hit (낚시대 올리기)";
        String exit="/exit (게임 종료)";
        
      System.out.println("================ 낚시 게임 ================");
      System.out.println("                             도움말: /help");

      Scanner sc = new Scanner(System.in);
      Random ran = new Random();
      
      while (true) {
         int Random_sea = ran.nextInt(53) + 0;  //물고기 종류(바다)
         int Random_river = ran.nextInt(27)+0;  //물고기 종류(강)
         
         System.out.printf("Command >");
         String Command = sc.nextLine().trim();
         System.out.println("");
         if (Command.equals("/help")) {
            System.out.println("┌────────── HELP ──────────┐");
            System.out.println("│                          │");
            System.out.printf ("│ %s      │\n",영빈아);
            System.out.printf ("│ %s        │\n",hit);
            System.out.println("│ }                        │");
            System.out.println("│                          │");
            System.out.printf ("│ %s          │\n",exit);
            System.out.println("│                          │");
            System.out.println("└──────────────────────────┘");
            System.out.println("");
         } else if (Command.equals("/영빈아 낚시")) {
            System.out.printf("강 / 바다 선택 > ");
            String choice = sc.nextLine().trim();
            System.out.println("");
            if(choice.equals("바다")) {
               int Random_sea_hit = ran.nextInt(21) + 1; //낚시 기다리기 시간
               System.out.println("낚시대를 바다에 던졌다!!");
               System.out.println("");
               System.out.println("기다리는 중.....");
               
               int Random_fishing= ran.nextInt(2)+0; //낚시 성공/실패
               
               try {                   
                    Thread.sleep(Random_sea_hit*1000); //딜레이!!
                 }
              catch(Exception e) {
                 System.out.println(e);
                 }
               
               if(Random_fishing==0) {
                System.out.println("!!! 앗 !!!!(/hit)");
                System.out.printf("Command >");
                String fish_hit = sc.nextLine().trim();
                int hit_random = ran.nextInt(1) + 0;
                  if(fish_hit.equals("/hit")&&hit_random==0) {
                     System.out.printf("%s 길이: ",fish_sea[Random_sea]);
                     seafish_length.fish_random_length();
                     System.out.println("");
                     System.out.println("");
                   }
                   else{
                	  System.out.println(""); 
                      System.out.println("물고기를 놓쳤다...");
                      System.out.println("");
                   }
               }
               else {
            	  System.out.println(""); 
                  System.out.printf("낚시 실패\n(자리를 잘못 잡았나...?)\n");
                  System.out.println("");
               }
        
            }
            else if(choice.equals("강")) {
               int Random_sea_hit = ran.nextInt(21) + 1;
               System.out.println("낚시찌를 에 던졌다!! (첨벙)");
               System.out.println("");
               System.out.println("기다리는 중.....");
               System.out.println("");
               
               
               try {
                    Thread.sleep(Random_sea_hit*1000); //딜레이!
                 }
              catch(Exception e) {
                 System.out.println(e);
                 }
               
               int Random_fishing= ran.nextInt(2)+0; //낚시 성공/실패
               if(Random_fishing==0) {
               System.out.println("!!! 앗 !!!!(/hit)");
               System.out.printf("Command >");
               String fish_hit = sc.nextLine().trim();
               int hit_random = ran.nextInt(1) + 0;
                if(fish_hit.equals("/hit")&&hit_random==0) {
                  System.out.printf("%s 길이: ", fish_river[Random_river]);
                  riverfish_length.fish_random_length();
                  System.out.println("");
                  System.out.println(""); 
                }
                else {
                  
                  System.out.println("물고기를 놓쳤다...");
                  System.out.println("");
                }
               }
               else {
            	  
                  System.out.printf("낚시 실패\n(자리를 잘못 잡았나...?)\n");
                  System.out.println("");
                }
              
            }
         } 
         else if (Command.equals("/exit")) {
            System.out.println("낚시게임을 종료 합니다!");
            break;
        }
         else {
        	 System.out.println("※ Command Error ※");
        	 System.out.println("");
         }
      }
      sc.close();
   }
}
class seafish_length{
	static Random ran1 = new Random();
	static float fish_length2 = ran1.nextFloat();
	static int fish_length1 = ran1.nextInt(11)+0;
	  static void fish_random_length() {
	   
	   float a=fish_length1+fish_length2;
	   System.out.printf("%.2f M",a);
	 }
}
class riverfish_length{
	static Random ran1 = new Random();
	static float fish_length2 = ran1.nextFloat();
	static int fish_length1 = ran1.nextInt(1)+0;
	  static void fish_random_length() {
	   
	   float a=fish_length1+fish_length2;
	   System.out.printf("%.2f M",a);
	 }
}