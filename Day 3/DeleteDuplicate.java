import java.util.List;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class DeleteDuplicate {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.setNode(node2);
        node2.setNode(node3);
        node3.setNode(node4);
        node4.setNode(node5);
        node5.setNode(node6);
        node6.setNode(node7);
        ListNode tmp = removeDuplicate(node1);
        traverse(tmp);
    }

    public static void traverse(ListNode node) {
        while (node != null) {
            System.out.println(node.getval());
            node = node.getNode();
        }
    }

    public static ListNode removeDuplicate(ListNode node) {
        ListNode firstPointer = new ListNode(0, node);
        ListNode secondPointer = firstPointer;

        while (node != null) {

            if (node.next != null && node.val == node.next.val) {
                while (node.next != null && node.val == node.next.val) {
                    node = node.next;
                }
                secondPointer.next = node.next;
            } else {
                secondPointer = secondPointer.next;
            }
            node = node.next;
        }

        return firstPointer.next;
    }
}

class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
        this.val = -1;
        this.next = null;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getval() {
        return this.val;
    }

    public ListNode getNode() {
        return this.next;
    }

    public void setval(int val) {
        this.val = val;
    }

    public void setNode(ListNode node) {
        this.next = node;
    }
}

/**
 * ListNode firstPointer = node;
 * ListNode secondPointer = firstPointer;
 * boolean isHead = true;
 * boolean isTail = false;
 * while (secondPointer.next != null) {
 * if (secondPointer.val != secondPointer.next.val) {
 * System.out.println("Itereate Normally");
 * secondPointer = secondPointer.next;
 * firstPointer = firstPointer.next;
 * isHead = false;
 * continue;
 * } else {
 * System.out.println("Same element found");
 * while (secondPointer.next != null && secondPointer.val ==
 * secondPointer.next.val) {
 * secondPointer = secondPointer.next;
 * }
 * if (secondPointer.next == null) {
 * isTail = true;
 * }
 * if (isHead) {
 * firstPointer = secondPointer.next;
 * } else if (isTail) {
 * firstPointer = firstPointer.next.next;
 * firstPointer = null;
 * } else {
 * firstPointer = firstPointer.next;
 * firstPointer = secondPointer.next;
 * }
 * isHead = false;
 * }
 * }
 * return firstPointer;
 */