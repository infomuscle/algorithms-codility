# Lesson 1
def solution(N):
    return max(list(map(len, format(N, 'b').strip("0").split("1"))))


n1 = 1041
n2 = 32
n3 = 15
n4 = 529
n5 = 9
n6 = 20

print(solution(n1))
print(solution(n2))
print(solution(n3))
print(solution(n4))
print(solution(n5))
print(solution(n6))
