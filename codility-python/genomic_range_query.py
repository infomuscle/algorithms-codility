# Lesson 5
def solution(S, P, Q):
    factors = {"A": 1, "C": 2, "G": 3, "T": 4}
    return [factors[min(S[P[i]: Q[i] + 1])] for i in range(len(P))]


s1 = "CAGCCTA"
p1 = [2, 5, 0]
q1 = [4, 5, 6]
print(solution(s1, p1, q1))
