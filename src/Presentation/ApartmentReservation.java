package Presentation;

import java.util.Date;

/**
 *
 * @author Bettina
 */
public class ApartmentReservation {
    
    Date startDate;
    Date endDate;
    int noOfPersons;
    int roomtype;
    
    public void showApartments()
    {
        
    }
    
    public void getstartDate(Date StartDate)
    {
        this.startDate = StartDate;
    }
    
    public void getendDate(Date EndDate)
    {
        this.endDate = EndDate;
    }
    
    public void getNoOfPersons(int NoOfPersons)
    {
        this.noOfPersons = NoOfPersons;
    }
    
    public void getRoomType(int roomType)
    {
        this.roomtype = roomType;
    }
   
    
    

 
    
    
    
}
