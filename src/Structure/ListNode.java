package Structure;


 public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public ListNode arrayToList(int[] x){
         ListNode head = new ListNode(x[0]);
         if(x.length == 0) return head;
         ListNode dummy = new ListNode(x[1]);
         head.next = dummy;
         for(int i = 2; i < x.length; i ++){
             ListNode tem = new ListNode(x[i]);
             dummy.next = tem;
             dummy = dummy.next;
         }
         return head;
     }

     public StringBuilder nodeToString( ListNode x){
         StringBuilder res = new StringBuilder( );
         while(x != null){
             res.append(x.val);
             res.append(", ");
             x = x.next;
         }
         return res;
     }
  }