# Write your MySQL query statement below
SELECT Eui.unique_id , E.name
FROM Employees E 
Natural LEFT JOIN EmployeeUNI Eui 
