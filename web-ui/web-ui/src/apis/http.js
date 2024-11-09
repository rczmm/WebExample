import axios from 'axios'

const httpInstance = axios.create({
    baseURL: 'http://localhost:8080',
    timeout: 500
})

httpInstance.interceptors.request.use(config => {
    return config
}, error => Promise.reject(error))

httpInstance.interceptors.response.use(response => response.data, error => {
    return Promise.reject(error)
})

export default httpInstance

