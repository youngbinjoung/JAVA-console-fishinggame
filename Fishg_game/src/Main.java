//2021_05_08~              ����: ������

import java.util.Random;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {

      String fish_sea[] = { "[���:�١١١١�] ������", "[���:�١١١١�] Ÿ�̾�", "[���:�١١١١�] ���尩", "[���:�١١١١�] �峭��",
    		                "[���:�ڡ١١١�] ��ġ", "����", "��ġ","�����","�����",
    		                "�����","�����","����","���","û��","��ġ","�뱸","�Ʊ�","���ڹ�","��ġ","����",
    		                "��ġ","��ġ","��ġ","����","���ޱ�","��谨��","����","�췰","��ġ","�ٶ���","���",
    		                "��ġ���","���","���繬","����","������","����","����","����","����","��ġ���","���",
    		                "Ȳ��ġ","ȫ��","[���:�ڡڡڡڡ�] ���Ƹ�","[���:�ڡڡڡڡ�] ����","[���:�ڡڡڡڡ�] û��ġ",
    		                "[���:�ڡڡڡڡ�] �ٴ��ڳ���","[���:�ڡڡڡڡ�] �ٴپǾ�","[���:�ڡڡڡڡ�] ������","[���:�ڡڡڡڡ�] �������",
    		                "[���:�ڡڡڡڡ�] ����"}; // �ٴ�

      String fish_river[] = { "������", "Ÿ�̾�", "���尩", "�峭��","�ؾ�","���","[���:�ڡڡڡڡ�] �轺","ö�����","�����",
    		                  "�������","����","�̲ٶ���","�׾�","���","Ȳ��","�Ƕ��","�ޱ�","���ڰ�","����",
    		                  "��õ��","�۾�","��ġ","����","����","����ġ","����"}; // ��(�ι�)
      
      //help
        String �����="/����� ���� (���� ����)";
        String hit="/hit (���ô� �ø���)";
        String exit="/exit (���� ����)";
        
      System.out.println("================ ���� ���� ================");
      System.out.println("                             ����: /help");

      Scanner sc = new Scanner(System.in);
      Random ran = new Random();
      
      while (true) {
         int Random_sea = ran.nextInt(53) + 0;  //����� ����(�ٴ�)
         int Random_river = ran.nextInt(27)+0;  //����� ����(��)
         
         System.out.printf("Command >");
         String Command = sc.nextLine().trim();
         System.out.println("");
         if (Command.equals("/help")) {
            System.out.println("���������������������� HELP ����������������������");
            System.out.println("��                          ��");
            System.out.printf ("�� %s      ��\n",�����);
            System.out.printf ("�� %s        ��\n",hit);
            System.out.println("�� }                        ��");
            System.out.println("��                          ��");
            System.out.printf ("�� %s          ��\n",exit);
            System.out.println("��                          ��");
            System.out.println("��������������������������������������������������������");
            System.out.println("");
         } else if (Command.equals("/����� ����")) {
            System.out.printf("�� / �ٴ� ���� > ");
            String choice = sc.nextLine().trim();
            System.out.println("");
            if(choice.equals("�ٴ�")) {
               int Random_sea_hit = ran.nextInt(21) + 1; //���� ��ٸ��� �ð�
               System.out.println("���ô븦 �ٴٿ� ������!!");
               System.out.println("");
               System.out.println("��ٸ��� ��.....");
               
               int Random_fishing= ran.nextInt(2)+0; //���� ����/����
               
               try {                   
                    Thread.sleep(Random_sea_hit*1000); //������!!
                 }
              catch(Exception e) {
                 System.out.println(e);
                 }
               
               if(Random_fishing==0) {
                System.out.println("!!! �� !!!!(/hit)");
                System.out.printf("Command >");
                String fish_hit = sc.nextLine().trim();
                int hit_random = ran.nextInt(1) + 0;
                  if(fish_hit.equals("/hit")&&hit_random==0) {
                     System.out.printf("%s ����: ",fish_sea[Random_sea]);
                     seafish_length.fish_random_length();
                     System.out.println("");
                     System.out.println("");
                   }
                   else{
                	  System.out.println(""); 
                      System.out.println("����⸦ ���ƴ�...");
                      System.out.println("");
                   }
               }
               else {
            	  System.out.println(""); 
                  System.out.printf("���� ����\n(�ڸ��� �߸� ��ҳ�...?)\n");
                  System.out.println("");
               }
        
            }
            else if(choice.equals("��")) {
               int Random_sea_hit = ran.nextInt(21) + 1;
               System.out.println("����� �� ������!! (÷��)");
               System.out.println("");
               System.out.println("��ٸ��� ��.....");
               System.out.println("");
               
               
               try {
                    Thread.sleep(Random_sea_hit*1000); //������!
                 }
              catch(Exception e) {
                 System.out.println(e);
                 }
               
               int Random_fishing= ran.nextInt(2)+0; //���� ����/����
               if(Random_fishing==0) {
               System.out.println("!!! �� !!!!(/hit)");
               System.out.printf("Command >");
               String fish_hit = sc.nextLine().trim();
               int hit_random = ran.nextInt(1) + 0;
                if(fish_hit.equals("/hit")&&hit_random==0) {
                  System.out.printf("%s ����: ", fish_river[Random_river]);
                  riverfish_length.fish_random_length();
                  System.out.println("");
                  System.out.println(""); 
                }
                else {
                  
                  System.out.println("����⸦ ���ƴ�...");
                  System.out.println("");
                }
               }
               else {
            	  
                  System.out.printf("���� ����\n(�ڸ��� �߸� ��ҳ�...?)\n");
                  System.out.println("");
                }
              
            }
         } 
         else if (Command.equals("/exit")) {
            System.out.println("���ð����� ���� �մϴ�!");
            break;
        }
         else {
        	 System.out.println("�� Command Error ��");
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