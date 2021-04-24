#문자열 내림차순으로 배치하기

def solution(s):
    list = []
    for i in range(len(s)):
        list.append(s[i:i+1])
    list.sort(reverse = True)
    return "".join(list)