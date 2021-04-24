def solution(s):
    list = []
    for i in range(len(s)):
        list.append(s[i:i+1])
    list.sort(reverse = True)
    return "".join(list)