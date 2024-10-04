# Write your MySQL query statement below
SELECT Eui.unique_id , E.name
FROM Employees E 
LEFT JOIN EmployeeUNI Eui 
ON E.id = Eui.id;