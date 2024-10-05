public class days {
    public static void main(String[] args) {
        int choice=7;
        switch (choice){
        case 1:
            System.out.println("Monday:I need coffee");
            break;
        case 2:
            System.out.println("Tueday:I need tea");
            break;
        case 3:
            System.out.println("Wednesday:I need dinner");  
            break;
        case 4:
            System.out.println("Thursday:I need lunch");    
            break;
        case 5:
            System.out.println("Friday:I need breakfast");
            break;
        case 6:
            System.out.println("Saturday:I need coldjuice");  
            break;
        case 7:
            System.out.println("Sunday:I need cake");    
            break;
        default:
            System.out.println("error:day not exist"); 
            break;  
    }
    }
}
