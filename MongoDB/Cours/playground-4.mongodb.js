// aggregation

use("restau");

// db.restaurants.aggregate({$match: {rating: 5}},
// {$count:"comptage"});


// db.restaurants.aggregate({$match: {rating: 5}}, {$project: {URL: 1, name: 1}})

// db.restaurants.aggregate({$group: {_id: "$type_of_food" , count: {$sum: 1}}})

// db.restaurants.aggregate([
//   { $group: { _id: "$type_of_food", count: { $sum: 1 } } },
//   { $match: { count: { $gt: 10 } } },
//   { $sort: { count: -1 } },
// ]);


// db.restaurants.aggregate({$group: {_id: "$postcode", nombre_restaurant : {$sum:1}}})

// db.restaurants.aggregate([{$match : {type_of_food : "Thai", rating: {$gt: 4}}},{$project: {
// _id: 0, type_of_food : 1, rating : 1}}, {$limit: 3}])

// db.restaurants.aggregate({$match : {type_of_food : "Caribbean"}}, {$count: "no_restau_carribean"})

// db.restaurants.aggregate({
//   $group: { _id: "type_of_food", note_moyenne: { $avg: "$rating" } },
// });

db.restaurants.aggregate([
    {$match:  {rating: {$ne : "Not yet rated"}}},
    {$group : {_id: "$type_of_food", total_rating : {$sum : "$rating"},
    avg_rating: {$avg: "$rating" },
    max_rating :{$max :"$rating" },
    min_rating :{$min:"$rating" } }}])

















