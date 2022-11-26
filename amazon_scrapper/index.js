const express = require('express');
const res = require('express/lib/response');
const request = require('request-promise');

const app = express();
const PORT = 5000 || process.env.PORT ;

const apiKey = '1aa72d485ba10c881f3f1c9bb2be22e1';
const baseUrl = 'http://api.scraperapi.com?api_key=${apiKey}&autoparse=true';

app.use(express.json());

app.get('/',(req,res) =>{
    res.send('Welcome to Amazon scrapper API');
});

app.listen(PORT, ()=>console.log('Server running on port ${PORT}'));