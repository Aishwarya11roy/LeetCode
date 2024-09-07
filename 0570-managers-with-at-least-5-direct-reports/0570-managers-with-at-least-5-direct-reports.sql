SELECT 
    e.name
FROM 
    Employee e
JOIN 
    (SELECT 
        managerId
     FROM 
        Employee
     WHERE 
        managerId IS NOT NULL
     GROUP BY 
        managerId
     HAVING 
        COUNT(*) >= 5) AS managers_with_reports
ON 
    e.id = managers_with_reports.managerId;
