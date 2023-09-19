(window.webpackJsonp=window.webpackJsonp||[]).push([[39],{1054:function(e,t,r){"use strict";r.r(t);r(13),r(9),r(12),r(4),r(21),r(10),r(22);var o=r(17),n=(r(29),r(26),r(50));r(25),r(57),r(16);function c(object,e){var t=Object.keys(object);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(object);e&&(r=r.filter((function(e){return Object.getOwnPropertyDescriptor(object,e).enumerable}))),t.push.apply(t,r)}return t}function l(e){for(var i=1;i<arguments.length;i++){var source=null!=arguments[i]?arguments[i]:{};i%2?c(Object(source),!0).forEach((function(t){Object(o.a)(e,t,source[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(source)):c(Object(source)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(source,t))}))}return e}var m={name:"ContactTeamModal",props:{account:{type:Object,required:!1,default:null}},data:function(){return{name:"",email:this.account?this.account.email:"",companyWebsite:"",accountNumber:"",phoneNumber:"",debounceTimer:setTimeout((function(){})),formError:"",formSuccess:""}},methods:l(l({},Object(n.b)({getInTouchTeamAccountLead:"account/getInTouchTeamAccountLead"})),{},{resetFormMessages:function(){this.formSuccess=this.formError=""},sendForm:function(){var e=this;this.resetFormMessages(),clearTimeout(this.debounceTimer),this.debounceTimer=setTimeout((function(){if(""===e.name)return e.formError="Please enter your name",!1;return/^(([^<>()[\]\\.,;:\s@']+(\.[^<>()[\]\\.,;:\s@']+)*)|('.+'))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(String(e.email).toLowerCase())?""===e.companyWebsite?(e.formError="Please enter a company Website",!1):""===e.phoneNumber?(e.formError="Please enter a phone number",!1):(e.getInTouchTeamAccountLead({email:e.email,displayName:e.name,company:e.companyWebsite,phone:e.phoneNumber}),e.name="",e.email="",e.companyWebsite="",e.accountNumber="",e.phoneNumber="",e.$modal.hide("contact-team-form"),e.$refs.submit.value="",e.formSuccess="Successfully sent your message.",void e.$toast.show("Check your email for the next steps to sign up your team.",{duration:1e4,className:"vm-toasted",action:{text:"Close",onClick:function(e,t){t.goAway(0)}}})):(e.formError="Please enter a valid email",!1)}),500)}})},f=r(19),component=Object(f.a)(m,(function(){var e=this,t=e._self._c;return t("client-only",[t("modal",{attrs:{name:"contact-team-form",height:"auto",scrollable:""}},[t("form",{staticClass:"form",on:{submit:function(t){return t.preventDefault(),e.submit.apply(null,arguments)}}},[t("h3",{staticClass:"form-title"},[e._v("Get in touch")])]),t("div",{staticClass:"contact-form"},[t("form",{staticClass:"form",on:{submit:function(t){return t.preventDefault(),e.submit.apply(null,arguments)}}},[t("div",{staticClass:"form-group"},[t("label",{staticClass:"visually-hidden",attrs:{for:"name"}},[e._v("Name")]),t("input",{directives:[{name:"model",rawName:"v-model",value:e.name,expression:"name"}],staticClass:"input -hollow",attrs:{placeholder:"Name",autofocus:""},domProps:{value:e.name},on:{input:function(t){t.target.composing||(e.name=t.target.value)}}})]),t("div",{staticClass:"form-group"},[t("label",{staticClass:"visually-hidden",attrs:{for:"companyWebsite"}},[e._v("Company")]),t("input",{directives:[{name:"model",rawName:"v-model",value:e.companyWebsite,expression:"companyWebsite"}],staticClass:"input -hollow",attrs:{placeholder:"Company"},domProps:{value:e.companyWebsite},on:{input:function(t){t.target.composing||(e.companyWebsite=t.target.value)}}})]),t("div",{staticClass:"form-group"},[t("label",{staticClass:"visually-hidden",attrs:{for:"email"}},[e._v("Email")]),t("input",{directives:[{name:"model",rawName:"v-model",value:e.email,expression:"email"}],staticClass:"input -hollow",attrs:{placeholder:"Email",type:"email"},domProps:{value:e.email},on:{input:function(t){t.target.composing||(e.email=t.target.value)}}})]),t("div",{staticClass:"form-group"},[t("label",{staticClass:"visually-hidden",attrs:{for:"phoneNumber"}},[e._v("Phone Number?")]),t("input",{directives:[{name:"model",rawName:"v-model",value:e.phoneNumber,expression:"phoneNumber"}],staticClass:"input -hollow",attrs:{placeholder:"Phone Number?"},domProps:{value:e.phoneNumber},on:{input:function(t){t.target.composing||(e.phoneNumber=t.target.value)}}})]),t("div",{staticClass:"form-error"},[e.formError.length>0?t("div",{staticClass:"-is-error",domProps:{textContent:e._s(e.formError)}}):e._e(),e.formSuccess.length>0?t("div",{staticClass:"-is-success",domProps:{textContent:e._s(e.formSuccess)}}):e._e()]),t("div",{staticClass:"form-group"},[t("input",{ref:"submit",staticClass:"button primary",attrs:{type:"button",value:"Send"},on:{click:function(t){return e.sendForm()}}})])])])])],1)}),[],!1,null,"10f0844e",null),d=component.exports,v=r(625),h=r(831),y=r(832),w=r(684);function j(object,e){var t=Object.keys(object);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(object);e&&(r=r.filter((function(e){return Object.getOwnPropertyDescriptor(object,e).enumerable}))),t.push.apply(t,r)}return t}function k(e){for(var i=1;i<arguments.length;i++){var source=null!=arguments[i]?arguments[i]:{};i%2?j(Object(source),!0).forEach((function(t){Object(o.a)(e,t,source[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(source)):j(Object(source)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(source,t))}))}return e}var O={name:"PagePricing",components:{ContactTeamModal:d,PriceDisplayCard:r(833).a,Testimonials:v.a,CollapseFaq:h.a,Counter:y.a},asyncData:function(e){var t=e.redirect,r=e.route;if(r&&r.query&&r.query.coupon&&"Elevate40"===r.query.coupon)return t("/pricing")},data:function(){return{amount:6e5,hover:!1,testimonials:w.testimonials}},middleware:"anonymous",computed:k(k({},Object(n.d)({account:function(e){return e.account.account},coupon:function(e){return e.account.coupon},refresh:function(e){return e.refresh}})),{},{freeText:function(){return this.account?"Current Plan":"Select Plan"},prices:function(){var e=this,t=this.pricesBase.monthly,r=this.pricesBase.year;return this.coupon&&"active"===this.coupon.status&&(this.coupon.plan_ids?this.coupon.plan_ids.map((function(o){switch(o){case"monthly-subscription":t=t*(100-e.coupon.discount_percentage)/100;break;case"year-subscription":r=r*(100-e.coupon.discount_percentage)/100}})):(t=t*(100-this.coupon.discount_percentage)/100,r=r*(100-this.coupon.discount_percentage)/100)),console.log("yearPrice: => ",r),{monthly:t,year:r}},discountApplied:function(){return"".concat(!this.refresh&&this.isYearDiscounted?2:1," Discount").concat(!this.refresh&&this.isYearDiscounted?"s":""," Applied")},isMonthDiscounted:function(){return this.prices.monthly!==this.pricesBase.monthly},isYearDiscounted:function(){return this.prices.year!==this.pricesBase.year},is50offDiscount:function(){return this.coupon&&this.coupon.id&&"50%Annual"===this.coupon.id}}),methods:{updateParticipation:function(e){e?(this.amount+=25*e/100,this.hover=!0):(this.amount=this.baseAmount,this.hover=!1)},openLogin:function(){this.account||this.$modal.show("login-form",{newAccount:!0,headerTitle:"Sign Up for a Free Account",location:this.location})},openTeamContact:function(){this.$modal.show("contact-team-form")}},head:function(){return{title:"Pricing | Vue Mastery",meta:[{hid:"description",name:"description",content:"Master your craft by joining the ultimate platform for Vue developers to elevate their career. Individual & Team plans."},{hid:"keywords",name:"keywords",content:"vuejs, vue js, vue.js, vue.js tutorial, vuejs tutorial, vue.js tutorial, vuejs components, vuejs framework, learn vuejs, learn vue, learn vue js, nuxt, nuxtjs, nuxt js, nuxt.js, vue router, vue routing, pinia, vuex, typescript, vue course, vuejs course, vue.js course, vue js course, vite, vite.js, vitejs, vite js, vue workshop, vuejs workshop, vue js workshop, vue.js workshop, vue training, vuejs training, vue js training, vue.js training, vue conference, vuejs conference, vue.js conference, vue js conference"}]}}},C=(r(913),Object(f.a)(O,(function(){var e=this,t=e._self._c;return t("div",{staticClass:"container",class:{refresh:e.refresh}},[t("ContactTeamModal",{attrs:{account:e.account}}),t("PriceDisplayCard",{attrs:{pageTitleBig:"A Vue Mastery subscription gives you access to our library of Vue courses"}}),t("counter",{attrs:{participation:e.amount,hover:e.hover}}),t("div",{staticClass:"bg-wrapper faq-wrapper"},[t("testimonials",{attrs:{testimonials:e.testimonials}}),t("collapse-faq")],1)],1)}),[],!1,null,"8a5a5f6c",null));t.default=C.exports},767:function(e,t,r){var content=r(914);content.__esModule&&(content=content.default),"string"==typeof content&&(content=[[e.i,content,""]]),content.locals&&(e.exports=content.locals);(0,r(49).default)("2ef4afe9",content,!0,{sourceMap:!1})},913:function(e,t,r){"use strict";r(767)},914:function(e,t,r){var o=r(48)(!1);o.push([e.i,'.monthly[data-v-8a5a5f6c]{grid-area:monthly}.annually[data-v-8a5a5f6c]{grid-area:annually}.team[data-v-8a5a5f6c]{grid-area:team}.container[data-v-8a5a5f6c]{transform-style:preserve-3d;background:transparent}.container[data-v-8a5a5f6c]:before{content:"";position:absolute;top:0;right:0;bottom:0;left:0;background-image:url(/images/price/background.png);background-size:cover;background-position:50%;-webkit-overflow-scrolling:touch;transform:translateZ(-1px) scale(1.5);transform-origin:bottom}.wrapper[data-v-8a5a5f6c]{padding-top:7rem;padding-bottom:2rem}@media screen and (min-width:40em){.wrapper[data-v-8a5a5f6c]{padding-bottom:5rem}}.bg-wrapper[data-v-8a5a5f6c]{position:relative;transform-style:preserve-3d}.bg-wrapper[data-v-8a5a5f6c]:after,.bg-wrapper[data-v-8a5a5f6c]:before{content:"";position:absolute;top:0;right:0;bottom:0;left:0;background-image:url(/images/price/ship.svg);background-repeat:no-repeat;z-index:1;pointer-events:none}.bg-wrapper[data-v-8a5a5f6c]:before{background-image:url(/images/price/planets.svg);background-position:center 7rem;background-size:100%}@media screen and (min-width:40em){.bg-wrapper[data-v-8a5a5f6c]:before{transform:translateZ(-.2px) scale(1.1);transform-origin:bottom}}.bg-wrapper[data-v-8a5a5f6c]:after{background-size:90%;background-position:right bottom 3rem}@media screen and (min-width:40em){.bg-wrapper[data-v-8a5a5f6c]:after{transform:translateZ(-.4px) scale(1.2);bottom:-1px;left:-4px;background-position:right bottom 5rem}}.bg-wrapper.faq-wrapper[data-v-8a5a5f6c]:before{background-image:url(/images/faq/planets.svg);background-size:cover;background-position:bottom}.bg-wrapper.faq-wrapper[data-v-8a5a5f6c]:after{background-image:url(/images/faq/front.png);background-position:bottom;background-size:100% auto;transform:none}.side-card-left[data-v-8a5a5f6c]{grid-area:monthly}.center-card[data-v-8a5a5f6c]{grid-area:annually}.side-card-right[data-v-8a5a5f6c]{grid-area:free-sub}.page-title[data-v-8a5a5f6c]{margin:1rem auto 3rem;max-width:84vw;font-size:20px;color:#fff}@media screen and (min-width:40em){.page-title[data-v-8a5a5f6c]{font-size:28px;width:33rem;margin:3rem auto;font-weight:700}}.swipe-back-enter-active[data-v-8a5a5f6c],.swipe-back-leave-active[data-v-8a5a5f6c],.swipe-enter-active[data-v-8a5a5f6c],.swipe-leave-active[data-v-8a5a5f6c]{transition:opacity .3s,transform .3s}.swipe-back-enter[data-v-8a5a5f6c],.swipe-enter[data-v-8a5a5f6c]{opacity:0;transform:translateX(-20px)}.swipe-back-leave-to[data-v-8a5a5f6c],.swipe-leave-to[data-v-8a5a5f6c]{opacity:0;transform:translateX(20px)}.swipe-back-enter[data-v-8a5a5f6c]{transform:translateX(20px)}.swipe-back-leave-to[data-v-8a5a5f6c]{transform:translateX(-20px)}.call[data-v-8a5a5f6c]{display:flex;align-self:center;margin:0 .5rem}.call-copy[data-v-8a5a5f6c]{display:flex;justify-content:center;align-items:center;margin-top:0}.call-copy strong[data-v-8a5a5f6c]{margin-left:.5rem}@keyframes refreshing-8a5a5f6c{0%{transform:scale(1)}10%{transform:scale(.95)}20%{transform:scale(1)}40%{transform:scale(.95)}60%{transform:scale(1)}80%{transform:scale(.95)}to{transform:scale(1)}}',""]),e.exports=o}}]);