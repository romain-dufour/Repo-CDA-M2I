// aggregation

use("restau");

db.restaurants.aggregate({$match: {rating: 5}},
{$count:"comptage"});