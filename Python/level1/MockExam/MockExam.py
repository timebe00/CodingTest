def solution(answers):
    A = [1,2,3,4,5]
    B = [2, 1, 2, 3, 2, 4]
    C = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = 0
    dic = {1 : 0, 2 : 0, 3 : 0}
    answer = []
    for i in answers:
        if A[cnt % 5] == i:
            dic[1] += 1

        if B[cnt % 8] == i:
            dic[2] += 1

        if C[cnt % 10] == i:
            dic[3] += 1
        cnt += 1

    maxVal = max(dic.values())

    for key, val in dic.items():
        if maxVal == val:
            answer.append(key)
    return answer