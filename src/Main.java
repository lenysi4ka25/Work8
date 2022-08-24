public class Main {
    public static void main(String[] args) {
        var TotalWorkingHours = 640;
        var EmployeeNormOfHours = 8;
        var State1 = TotalWorkingHours / EmployeeNormOfHours;
        System.out.println("Всего работников в компании - " + State1 + " человек.");
        var State2 = 94;
        var State = State1 +  State2;
        var TotalHours = State * 8;
        System.out.println("Если в компании работает " + State + " человек, то всего " + TotalHours + " часов работы может быть поделено между сотрудниками.");
    }
}