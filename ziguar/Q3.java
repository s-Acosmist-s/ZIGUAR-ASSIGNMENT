/*
The idea is that when the fast pointer reaches the end of the linked list, 
the slow pointer points to the middle element of the linked list.
*/
public int getMiddle(Node head)  
{  
    //If the head(or the list) dosent exists, then return -1 indicating that the list is empty.   
    if(head == null)   
    {  
        return -1;  
    }  
    //Fast pointer moves by two steps while the slow pointer moves by one step at a time.
    Node slow = head;  
    Node fast = head;  
    while(fast != null && fast.next != null)  
    {  
        fast = fast.next.next;   
        slow = slow.next;  
    }  
    return slow.data;
}  


