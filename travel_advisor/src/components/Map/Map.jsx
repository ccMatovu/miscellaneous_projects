import { useMemo } from 'react';
import { useLoadScript, Marker } from '@react-google-maps/api';
import GoogleMapReact  from 'google-map-react';

export default function Home() {
  const { isLoaded } = useLoadScript({
    googleMapsApiKey: 'AIzaSyAsRhrnYxNcZO-o0WKROEPimDh4UkWh7EI',
  })
  console.log("loasdd");

  if (!isLoaded) return <div>Loading...</div>
  return <>
  <div>now</div>
  <Map googleMapsApiKey />
  <div>after</div>
  </>
}

function Map({}) {
  const { isLoaded } = useLoadScript({
    googleMapsApiKey: 'AIzaSyAsRhrnYxNcZO-o0WKROEPimDh4UkWh7EI',
  })
  console.log('loasdd')

  if (!isLoaded) return <div>Loading...</div>
  const center = useMemo(() => ({ lat: 44, lng: -80 }), [])
  console.log("maphere");

  return (<>
  <div>here</div>
    <GoogleMapReact
      zoom={10}
      center={center}
      mapContainerClassName='map-container'
      bootstrapURLKeys={{ key: {googleMapsApiKey} }}
    >
      <Marker position={center} />
    </GoogleMapReact>
    </>
  )
  
}
