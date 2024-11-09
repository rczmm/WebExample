import httpInstance from "@/apis/http.js";

export function listUser() {
    return httpInstance({
        url: 'user/list'
    })
}