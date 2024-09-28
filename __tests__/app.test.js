const request = require('supertest'); // We will use supertest to test our Express app
const app = require('../index'); // Adjust this path according to your directory structure

describe('Application Tests', () => {
    test('should respond with Hello World!', async () => {
        const response = await request(app).get('/');
        expect(response.statusCode).toBe(200);
        expect(response.text).toBe('Hello World!');
    });
});
