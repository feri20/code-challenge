select (select count(city) from station)-(select count(distinct city) from station) as difference;
select city , length(city) as number from station where length(city) = (select min(length(city)) from station) order by city ASC limit 1;
