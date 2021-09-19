# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        seen = set()
        while head != None:
          if head.next in seen:
            return True
          seen.add(head.next)
          head = head.next
        return False
        