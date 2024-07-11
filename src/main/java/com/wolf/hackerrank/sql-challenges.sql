select (select count(city) from station)-(select count(distinct city) from station) as difference;/* minus in sql */
select city , length(city) as number from station where length(city) = (select min(length(city)) from station) order by city ASC limit 1;
select city from station where city like 'i%' or city like 'u%' or city like 'e%' or city like 'a%' or city like 'o%';
select distinct city from station where city REGEXP '^[aeiouAEIOU]';/* return cities that start with vowels */
select city from station where city not REGEXP '^[aeiouAEIOU].*[aeiouAEIOU]$';/* return cities that does not start and end with vowels */
select name from students where marks>75 order by substring(name,-3) ; /*order result based on last three character */
select name from students where marks>75 order by substring(name,3),id ; /*order result based on first three character
                                                                           and if there is two words the same sort then based on id */
