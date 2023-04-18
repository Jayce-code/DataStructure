package DataStructure.exercise.linked_list;


/**
 * 单链表结构
 */
public class ListNode {
    int value;
    ListNode next;

    ListNode(){}

    ListNode(int val) {
        this.value = val;
    }

    ListNode(int val, ListNode next) {
        this.value = val;
        this.next = next;
    }
}
