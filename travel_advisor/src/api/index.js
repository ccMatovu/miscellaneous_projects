import axios from 'axios';

  const URL = 'https://travel-advisor.p.rapidapi.com/restaurants/list-in-boundary';

const options = {
  params: {
    bl_latitude: '11.847676',
    tr_latitude: '12.838442',
    bl_longitude: '109.095887',
    tr_longitude: '109.149359',
  },
  headers: {
    'X-RapidAPI-Key': '1065286a61mshe60a0f7a4e3d43ep19dd03jsn761a0375096a',
    'X-RapidAPI-Host': 'travel-advisor.p.rapidapi.com',
  },
}

export const getPlacesData = async()=>{
  try{
    const {data:{data}} = await axios.get(URL,options);
    //console.log("here is the data = ",data);
    return data;
  }  catch (error){
    console.log(error);
  }
};