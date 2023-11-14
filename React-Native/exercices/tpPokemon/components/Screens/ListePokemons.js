import React, { useEffect, useState } from 'react';
import { View, FlatList } from 'react-native';
import GridPokemon from '../GridPokemon';

export default function Pokemons({ navigation }) {
  const [pokeListe, setPokeListe] = useState([]);
  const [pokeInfos, setPokeInfos] = useState([]);

  useEffect(() => {
    fetch("https://pokeapi.co/api/v2/pokemon?offset=10&limit=50")
      .then(response => response.json())
      .then(data => {
        setPokeListe(data.results);
        return data.results.map(pokemon => pokemon.url);
      })
      .then(urls => {
        urls.forEach(url => {
          fetch(url)
            .then(resp => resp.json())
            .then(pokemonDetail => {
              setPokeInfos(currentDetails => [...currentDetails, pokemonDetail]);
            })
            .catch(error => console.log(error));
        });
      })
      .catch(error => console.log(error));
  }, []);



  return (
    <View>
      <FlatList
        data={pokeInfos}
        keyExtractor={(item, index) => index.toString()} 
        renderItem={({ item }) => {
          return (
            <GridPokemon
              name={item.name}
              type={item.types}
               image={item.sprites.front_default}
              onPress={() => navigation.navigate('DetailsPokemon', { name: item})}
            />
          );
        }}
        numColumns={2}
      />
    </View>
  );
}