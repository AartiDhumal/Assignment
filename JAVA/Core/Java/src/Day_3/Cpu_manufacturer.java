package Day_2;

class CPU {
    double price ;
    //nested class
    class Processor{
        //member of nested class
        double cores;
        String manufacturer;

        double getCatch(){
            System.out.println(cores+" core processor and manufactured by "+manufacturer);
            return 4.3;
        }
    }
    //nested protected class
    protected class RAM{
        //member of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            System.out.println(memory+"gb memory and manufactured by "+manufacturer);
            return 5.5;
        }
    }
}

public class Cpu_manufacturer {
    public static void main(String args[]){
        CPU cpu_obj = new CPU();
        CPU.Processor processor_obj = cpu_obj.new Processor();
        processor_obj.cores = 4 ;
        processor_obj.manufacturer = "intel" ;
        System.out.println(processor_obj.getCatch());
        CPU.RAM ram_obj = cpu_obj.new RAM();
        ram_obj.memory = 512 ;
        ram_obj.manufacturer = "intel" ;
        System.out.println(ram_obj.getClockSpeed());
    }
}