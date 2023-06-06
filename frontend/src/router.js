
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerManager from "./components/listers/CustomerCards"
import CustomerDetail from "./components/listers/CustomerDetail"

import RecipeManager from "./components/listers/RecipeCards"
import RecipeDetail from "./components/listers/RecipeDetail"
import ManualManager from "./components/listers/ManualCards"
import ManualDetail from "./components/listers/ManualDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },
            {
                path: '/customers/:id',
                name: 'CustomerDetail',
                component: CustomerDetail
            },

            {
                path: '/recipes',
                name: 'RecipeManager',
                component: RecipeManager
            },
            {
                path: '/recipes/:id',
                name: 'RecipeDetail',
                component: RecipeDetail
            },
            {
                path: '/manuals',
                name: 'ManualManager',
                component: ManualManager
            },
            {
                path: '/manuals/:id',
                name: 'ManualDetail',
                component: ManualDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },



    ]
})
