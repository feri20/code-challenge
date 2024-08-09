DELETE from demo where name in (select name from demo GROUP by name HAVING count(name)>1) and id not in (select id from demo GROUP by name HAVING count(name)>1);
select (select count(city) from station)-(select count(distinct city) from station) as difference;/* minus in sql */
select city , length(city) as number from station where length(city) = (select min(length(city)) from station) order by city ASC limit 1;
select city from station where city like 'i%' or city like 'u%' or city like 'e%' or city like 'a%' or city like 'o%';
select distinct city from station where city REGEXP '^[aeiouAEIOU]';/* return cities that start with vowels */
select city from station where city not REGEXP '^[aeiouAEIOU].*[aeiouAEIOU]$';/* return cities that does not start and end with vowels */
select name from students where marks>75 order by substring(name,-3) ; /*order result based on last three character */
select name from students where marks>75 order by substring(name,3),id ; /*order result based on first three character
                                                                           and if there is two words the same sort then based on id */
select name from employee order by name ASC ; /* return names ordered alphabetically */
select count(*) from city where population >100000  /* return cities number with population more than 100000*/

select case when A=B and B=C then 'Equilateral'
            when A=B and A!=C and A+B>C OR A!=B and B=C and B+C>A OR A=C and A!=B and A+C>B then 'Isosceles'
            when A!=B and A!=C and B!=C and A+B>C and A+C>B and B+C>A then 'Scalene'
            else 'Not A Triangle'
            end as triangle_type from TRIANGLES ;/*return triangle type based on 3 input*/

/* use concat - lower - substring*/
select concat(name,concat('(',substring(occupation,1,1),')')) from occupations order by name ASC ;
select concat('There are a total of ',count( occupation))
    as frequency,lower(concat(occupation,'s.')) from occupations
       group by occupation order by  frequency, occupation ASC;
