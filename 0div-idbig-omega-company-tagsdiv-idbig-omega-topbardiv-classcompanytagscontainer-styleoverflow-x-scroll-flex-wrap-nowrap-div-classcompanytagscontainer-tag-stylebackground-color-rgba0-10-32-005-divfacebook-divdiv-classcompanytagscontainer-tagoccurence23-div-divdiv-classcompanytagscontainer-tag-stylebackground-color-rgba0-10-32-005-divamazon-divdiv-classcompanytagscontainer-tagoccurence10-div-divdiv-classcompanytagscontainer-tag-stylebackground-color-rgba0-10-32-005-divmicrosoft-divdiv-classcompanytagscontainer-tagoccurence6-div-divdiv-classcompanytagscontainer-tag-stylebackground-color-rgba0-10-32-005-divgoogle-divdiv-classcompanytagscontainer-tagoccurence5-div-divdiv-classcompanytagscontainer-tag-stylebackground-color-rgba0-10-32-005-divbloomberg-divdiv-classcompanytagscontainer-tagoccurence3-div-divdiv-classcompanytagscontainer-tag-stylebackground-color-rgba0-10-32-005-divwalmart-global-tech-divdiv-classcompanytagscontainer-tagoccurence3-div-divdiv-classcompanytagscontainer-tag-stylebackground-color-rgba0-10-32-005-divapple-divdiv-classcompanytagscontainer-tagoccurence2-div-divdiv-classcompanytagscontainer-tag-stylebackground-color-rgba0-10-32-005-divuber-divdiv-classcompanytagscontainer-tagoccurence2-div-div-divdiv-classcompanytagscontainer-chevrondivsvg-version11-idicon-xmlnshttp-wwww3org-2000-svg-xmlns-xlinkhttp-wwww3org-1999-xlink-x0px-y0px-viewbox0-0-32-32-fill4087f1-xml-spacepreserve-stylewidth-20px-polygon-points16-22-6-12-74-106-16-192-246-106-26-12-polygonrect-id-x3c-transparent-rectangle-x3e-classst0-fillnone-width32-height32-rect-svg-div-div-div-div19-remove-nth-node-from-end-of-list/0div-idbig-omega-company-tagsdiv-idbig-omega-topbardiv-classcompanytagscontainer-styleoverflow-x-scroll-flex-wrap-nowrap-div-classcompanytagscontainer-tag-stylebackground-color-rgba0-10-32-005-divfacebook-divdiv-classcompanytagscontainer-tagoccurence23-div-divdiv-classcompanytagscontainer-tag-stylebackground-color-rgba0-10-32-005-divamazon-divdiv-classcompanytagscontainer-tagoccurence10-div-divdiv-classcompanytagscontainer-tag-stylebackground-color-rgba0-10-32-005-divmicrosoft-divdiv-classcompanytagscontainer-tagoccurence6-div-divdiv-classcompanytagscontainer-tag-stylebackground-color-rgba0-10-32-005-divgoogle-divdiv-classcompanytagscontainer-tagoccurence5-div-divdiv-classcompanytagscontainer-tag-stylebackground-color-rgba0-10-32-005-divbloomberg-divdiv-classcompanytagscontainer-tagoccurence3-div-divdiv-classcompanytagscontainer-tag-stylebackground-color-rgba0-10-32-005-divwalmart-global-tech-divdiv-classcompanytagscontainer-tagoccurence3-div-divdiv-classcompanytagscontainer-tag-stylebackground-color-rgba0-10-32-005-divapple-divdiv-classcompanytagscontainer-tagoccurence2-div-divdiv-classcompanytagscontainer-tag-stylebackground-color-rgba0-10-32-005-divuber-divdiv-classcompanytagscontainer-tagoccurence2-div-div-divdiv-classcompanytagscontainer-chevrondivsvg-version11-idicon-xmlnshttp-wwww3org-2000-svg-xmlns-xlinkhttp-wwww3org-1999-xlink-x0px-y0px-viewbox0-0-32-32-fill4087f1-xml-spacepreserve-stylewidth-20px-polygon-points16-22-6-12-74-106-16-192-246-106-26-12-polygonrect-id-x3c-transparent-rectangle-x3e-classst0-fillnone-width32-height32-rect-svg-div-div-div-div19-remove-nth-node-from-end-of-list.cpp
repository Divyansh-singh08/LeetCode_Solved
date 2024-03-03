/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* prev = nullptr;
        ListNode* curr = head;
        ListNode* fast = head;

        while(n-->0) fast = fast->next;
        
        while(fast){
            fast = fast->next;
            prev = curr;
            curr = curr->next;
        }

        if(prev) prev->next = curr->next;
        else return curr->next;

        delete curr;
        return head;
    }
};