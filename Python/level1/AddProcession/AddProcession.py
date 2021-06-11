#   행렬의 덧셈
def solution(arr1, arr2):
    arr3 = []
    for k in range(len(arr1)):
        arr3 += [[x + y for x, y in zip(arr1[k],arr2[k])]]
    print(arr3)
    return arr3
