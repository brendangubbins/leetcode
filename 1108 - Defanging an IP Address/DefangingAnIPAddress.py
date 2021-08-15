class Solution:
    def defangIPaddr(self, address: str) -> str:
      answer = ""
      for character in address:
          if character == '.':
            answer += '[.]'
          else:
            answer += character
      return answer