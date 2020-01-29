import request from '@/utils/request'
import { getToken } from '@/utils/auth'

export function login(data) {
  return request({
    url: 'http://localhost:9001/oauth/token?username=admin&password=123456&grant_type=password&client_id=client&client_secret=secret',
    method: 'post'
  })
}

export function getInfo(token) {
  return request({
    url: 'user/info',
    method: 'get'
    // params: { token }
  })
}

export function logout() {
  return request({
    url: '/user/logout?access_token=' + getToken(),
    method: 'post'
  })
}
