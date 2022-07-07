package Lesson7;


import Lesson7.hands.IHand;
import Lesson7.hands.SamsungHands;
import Lesson7.hands.SonyHands;
import Lesson7.hands.ToshibaHands;
import Lesson7.heads.IHead;
import Lesson7.heads.SamsungHead;
import Lesson7.heads.SonyHead;
import Lesson7.heads.ToshibaHead;
import Lesson7.legs.ILeg;
import Lesson7.legs.SamsungLeg;
import Lesson7.legs.SonyLeg;
import Lesson7.legs.ToshibaLeg;

public class Run {


    public static void main(String[] args) {

        IHead sonyHead = new SonyHead(2);
        IHead toshibaHead = new ToshibaHead(2);
        IHead samsungHead = new SamsungHead(2);

        IHand sonyHand = new SonyHands(2);
        IHand toshibaHand = new ToshibaHands(2);
        IHand samsungHand = new SamsungHands(2);

        ILeg sonyLeg = new SonyLeg(2);
        ILeg toshibaLeg = new ToshibaLeg(2);
        ILeg samsungLeg = new SamsungLeg(1);


        Robot r1 = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot r2 = new Robot(toshibaHead, sonyHand, toshibaLeg);
        Robot r3 = new Robot(samsungHead, samsungHand, sonyLeg);
        r1.action();
        r2.action();
        r3.action();


    }
}
