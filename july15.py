#User function Template for python3

class Solution:
    def deleteMidValue(self, s, sizeOfStack, mid):
        if sizeOfStack == mid:
            s.pop()
            return
        temp = s[-1]
        s.pop()
        self.deleteMidValue(s, len(s), mid)
        s.append(temp)

    def deleteMid(self, s, sizeOfStack):
        mid = (sizeOfStack + 1) // 2
        self.deleteMidValue(s, sizeOfStack, mid)

