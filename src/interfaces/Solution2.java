package interfaces;

public class Solution2 {
    /*
    Create interfaces Fly, Run, Swim.
    Add one method tho each
     */
    public interface Fly {
        private void sayMeow() {
            System.out.println("myu");
        }
        private void jump() {
            System.out.println("jump");
        }
    }
    public interface Run {
        private void TypeOfRunning() {
            System.out.println("marathon");
        }
        private void place() {
            System.out.println("stadium");
        }
    }
    public interface Swim {
        private void TypeOfSwimming() {
            System.out.println("breaststroke");
        }
        private void distance() {
            System.out.println("4 km");
        }
    }
}
