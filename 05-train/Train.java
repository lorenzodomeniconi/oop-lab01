public class Train {
    int nTotSeats, nFirstClassSeats, nSecondClassSeats;
    int nFirstClassReservedSeats, nSecondClassReservedSeats;

    void build(int firstClassSeats, int secondClassSeats, int firstReserved, int secondReserved){
        nTotSeats = firstClassSeats+secondClassSeats;
        nFirstClassSeats = firstClassSeats;
        nSecondClassSeats = secondClassSeats;
        nFirstClassReservedSeats = firstReserved;
        nSecondClassReservedSeats = secondReserved;
    }

    void reserveFirstClassSeats(int n){
        nFirstClassReservedSeats += n;
    }

    void reserveSecondClassSeats(int n){
        nSecondClassReservedSeats += n;
    }

    double getTotOccupancyRatio(){
        return ((double)(nFirstClassReservedSeats+nSecondClassReservedSeats)/(double)(nFirstClassSeats+nSecondClassSeats)*100);        
    }

    double getFirstClassOccupancyRatio(){
        return ((double)(nFirstClassReservedSeats)/(double)(nFirstClassSeats))*100;
    }

    double getSecondClassOccupancyRatio(){
        return ((double)(nSecondClassReservedSeats)/(double)(nSecondClassSeats))*100;
    }

    void deleteAllreservation(){
        nFirstClassReservedSeats = 0;
        nSecondClassReservedSeats = 0;        
    }
}
