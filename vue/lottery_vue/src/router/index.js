import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: '',
    component: LayoutView,
    children:[
      {
        path: '',
        name: 'home',
        component: HomeView
      },
      {
        path: 'admin',
        name: 'admin',
        component: AdminView
      },
      {
        path: 'Essay',
        name: 'essay',
        component: EssayView
      },
      {
        path: 'Design',
        name: 'design',
        component: HomeView
      },
      {
        path: 'TexasHoldem',
        name: 'texaspoker',
        component: TexasView
      },
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
