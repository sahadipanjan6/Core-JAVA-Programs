# Write a R program to find n'th highest value in a given vector.

myVector <- c(3, 1, 4, 7, 2, 90, 76, 109, 223)
valueOfN <- strtoi(readline("Enter the value of N: "))
myVector <- sort(x = myVector, decreasing = TRUE)
print(paste(valueOfN, "'th highest value:", myVector[valueOfN]))