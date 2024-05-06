const nba_teams = [
    {
    "conference": "Eastern",
    "division": "Atlantic",
    "name": "Boston Celtics",
    "city": "Boston",
    "state": "MA",
    "stadium": "TD Garden"
    },
    {
    "conference": "Eastern",
    "division": "Atlantic",
    "name": "Brooklyn Nets",
    "city": "New York",
    "state": "NY",
    "stadium": "Barclays Center"
    },
    {
    "conference": "Eastern",
    "division": "Atlantic",
    "name": "New York Knicks",
    "city": "New York",
    "state": "NY",
    "stadium": "Madison Square Garden"
    },
    {
    "conference": "Western",
    "division": "Pacific",
    "name": "Sacramento Kings",
    "city": "Sacramento",
    "state": "CA",
    "stadium": "Golden 1 Center"
    }
];

const result1 = nba_teams.filter(team => team.city === "New York");
const result2 = (nba_teams.filter(team => team.division === "Atlantic")).length;

const result3 = nba_teams.reduce((acc, team) =>{
    return acc + Object.values(team).reduce((acc, string) =>{
        return acc + string.length
    }, 0)
}, 0);

console.log(result1);
console.log(result2);
console.log(result3)

