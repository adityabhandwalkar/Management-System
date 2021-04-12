package school_management;

/**
 * This class keeps the track of student
 */
public class student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * fees for every student is same
     * student constructor
     * @param id
     * @param name
     * @param grade
     */
    public student(int id,  String name, int grade){
        this.feesPaid = 0;
        this.feesTotal= 3000;
        this.id = id;
        this.name = name;
        this.grade= grade;

    }

    /**
     * paying fees to school
     * @param fees
     */

    /**
     * updating the student grade where student will be promoted
     * to the next grade so setting the grade and returning
     * nothing
     * @param grade
     */
    public void setGrade(int grade){
        this.grade = grade;
    }
    /**
     * Changing the fees paid, it will keep adding
     * fees to feespaid
     */
    public void payfees(int fees){
         feesPaid += fees;
         mangementSystem.updateTotalMoneyearned(feesPaid);
    }
    public int remainingfees(){
        return  feesTotal-= feesPaid;
    }

    /**
     *  returning every detail of student
     * @return id, name , grade feespaid
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }





}
